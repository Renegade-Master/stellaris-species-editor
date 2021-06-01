/*
 * MIT License
 *
 * Copyright (c) 2021 Ciaran Bent
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package util

import ch.qos.logback.classic.Level
import ch.qos.logback.classic.Logger
import mu.KLogger
import mu.KotlinLogging

private var KLogger.level: Level
    get() = (underlyingLogger as Logger).level
    set(value) {
        (underlyingLogger as Logger).level = value
    }

/**
 * Wrapper for the MicroUtils Kotlin-Logging logger.
 * Reads logging level by default from the application.properties file.
 */
object Logger {
    private var loggerLevel: Level = Level.toLevel(Resource.getApplicationProperty("application-log-level"))
    private var loggers: MutableMap<String, KLogger> = mutableMapOf<String, KLogger>()
    private var log: KLogger = getLogger(object {}.javaClass.name)

    init {
        this.log.debug { "${this.log.name} initialised!" }
    }

    /**
     * Get a new Logger for a specific purpose.
     *
     * @param logLevel: The Logging level to set the new Logger to.  Defaults to the project log level.
     * @param name: The name for the new Logger.  Defaults to "DefaultLogger".
     *
     * @return A new KLogger instance.
     */
    fun getLogger(name: String = "DefaultLogger", logLevel: Level = this.loggerLevel): KLogger {
        val newLogger: KLogger = loggers.getOrDefault(name, KotlinLogging.logger(name))

        if (this.loggers.values.isEmpty()) {
            loggers.put(newLogger.name, newLogger)

            return newLogger
        }

        if (!loggers.containsKey(newLogger.name)) {
            newLogger.level = logLevel
            this.log.debug { "${newLogger.name} initialised!" }

            loggers.put(newLogger.name, newLogger)
            this.log.debug { "Logger [${newLogger.name}] added" }
        } else {
            this.log.debug { "Logger [${newLogger.name}] reused!" }
        }

        this.log.debug { "Logger Map length: ${this.loggers.values.size}" }

        return newLogger
    }
}