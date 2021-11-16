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
		name("TestJob10")
		name("testJob11")
		name("testJob12")

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
		name('QualityAnalysis-Test')
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
