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

listView("testView06") {
	jobs {
		name("TestJob")
		name("testJob-docker")
	}
}
