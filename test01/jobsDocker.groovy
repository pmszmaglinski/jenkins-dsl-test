pipelineJob("TestJob") {
    description()
    keepDependencies(false)
    definition {
        cps {
            script(readFileFromWorkspace('Jenkinsfile'))
		}
    }
    disabled(false)
}