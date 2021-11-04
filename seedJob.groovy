listView("testView01") {
	jobs {
		name("Test-job01")
		name("Test-job03")
		name("Test-job02")
	}
	columns {
		status()
		weather()
		name()
		lastSuccess()
		lastFailure()
		lastDuration()
		buildButton()
	}
}

listView("testView02") {
	jobs {
		name("Test-job02")

	}
	columns {
		status()
		weather()
		name()
		lastSuccess()
		lastFailure()
		lastDuration()
		buildButton()
	}
}

listView("testView04") {
	jobs {
		name("Test-job04")

	}
	columns {
		status()
		weather()
		name()
		lastSuccess()
		lastFailure()
		lastDuration()
		buildButton()
	}
}


job('Test-job01') {

  steps {
  
    shell('echo $JOB_NAME')
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
