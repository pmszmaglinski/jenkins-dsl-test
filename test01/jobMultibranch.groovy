multibranchPipelineJob('QualityAnalysis-Test') {
    displayName('QualityAnalysis-Test-DisplayName')
    branchSources {
        git {
            id('QualityAnalysis-Test')
            remote('https://dat.xxxxx.com/git/scm/da/xxx-repo.git')
            credentialsId('xxx_service')
            includes('(master|develop)')
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('jenkins/jobs/Jenkinsfile')
        }
    }
    configure {
        it / disabled << 'true'
    }
    orphanedItemStrategy {
        discardOldItems {
            daysToKeep(5)
        }
    }
    //triggers {
    //    periodic(5)
    //}
}