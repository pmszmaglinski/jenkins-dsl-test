job('Test-job01') {
  label('master')

  steps {
  
    shell('echo $JOB_NAME-$BUILD_NUMBER')
    shell('echo blablabla')
  }
}


job('Test-job02') {
  label('master')

  steps {
  
    shell('echo $JOB_NAME')
    shell('echo blablabla')

  }
}

job('Test-job03') {
  label('master')

  steps {
  
    shell('echo $JOB_NAME')
    shell('echo blablabla')
  }
}

job('Test-job04') {
  label('master')

  steps {
  
    shell('echo $JOB_NAME')
    shell('echo blablabla')
  }
}
