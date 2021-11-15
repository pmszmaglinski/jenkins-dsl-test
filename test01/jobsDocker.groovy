pipelineJob("TestJob") {
    description()
    keepDependencies(false)
    definition {
        cpsScm {
            scm { none() }
            """podTemplate (containers: [containerTemplate(name: 'alpine', image: 'alpine:latest', command: 'sleep', args: '99d'),
                                         containerTemplate(name: 'centos', image: 'centos:7', command: 'sleep', args: '99d')
                                        ]
                            ) {
                
    node(POD_LABEL) {
            
        stage('Jnlp') {
            println 'cycki'
            sh 'echo \$JAVA_OPTS'
        }
        
        stage('Alpine') {
            container('alpine') {
                sh 'cat /etc/os-release'
                sh 'echo \$JAVA_OPTS'
            }
        }
        
        stage('Centos') {
            container('centos') {
                sh 'cat /etc/os-release'
                sh 'echo \$JAVA_OPTS'
            }
        }
    }    
}"""		}
    }
    disabled(false)
}