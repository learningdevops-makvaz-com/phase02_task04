pipelineJob('manual_job') {
    definition {
        cpsScm {
	    scm{
	      git('https://github.com/danpaldev/phase02_task04', 'master')
	      scriptPath('jobs/manual_job.groovy')
	    }
        }
    }
}
