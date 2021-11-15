pipelineJob("TestJob") {
    description()
    keepDependencies(false)
    definition {
        cps {
            script(readFileFromWorkspace('test01/Jenkinsfile'))
            sandbox()
		}
    }
    disabled(false)
}