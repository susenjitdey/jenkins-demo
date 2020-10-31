pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/susenjitdey/fullstackgradle.git'
                    }
                    branch 'MyBranchFullStackThemepark#'
                }
            }
        }
    }
}
