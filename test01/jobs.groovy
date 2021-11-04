job('Test-job01') {

  steps {
  
    shell('echo $JOB_NAME-$BUILD_NUMBER')
  }
}


job('Test-job02') {

  steps {
  
    shell('echo echo $JOB_NAME')
  }
}

job('Test-job03') {

  steps {
  
    shell('echo echo $JOB_NAME')
  }
}

job('Test-job04') {

  steps {
  
    shell('echo echo $JOB_NAME')
  }
}
