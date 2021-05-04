# stellaris-species-editor

Short program written primarily to test out new Jetpack Desktop Compose library. Allows safe editing and option
selection for Stellaris Species file.

## Build Status

[![Gradle Build on PR](https://github.com/Renegade-Master/stellaris-species-editor/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/Renegade-Master/stellaris-species-editor/actions/workflows/gradle-build.yml)

[![Scan with Detekt](https://github.com/Renegade-Master/stellaris-species-editor/actions/workflows/detekt-static-code-analysis.yml/badge.svg)](https://github.com/Renegade-Master/stellaris-species-editor/actions/workflows/detekt-static-code-analysis.yml)

## Contributions

Contributions are encouraged, and welcome.  
When committing code to the repository, the only permitted branch to push to is `require/review`.  
To push to this branch, this is the workflow that you should follow:

1. Make your changes.

```zsh
$ vim <file_to_edit>
```

2. Commit and sign your changes.

```zsh
$ git add <file_to_edit>
$ git commit -S
```

3. Make sure you are up to date.

```zsh
$ git fetch; git pull --rebase
```

4. Push your new commit to the correct remote branch.

```zsh
$ git push origin HEAD:require/review
```

5. Create a Pull Request on GitHub.

6. Await an Administrator's approval.
