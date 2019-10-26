pipeline {
	agent any
    stages {
    	stage('init') {
    		steps {
    			echo 'Hola mundo'
    		}
    	}
        stage('build') {
            steps {
                mvn package
            }
        }
        stage('finish') {
        	steps {
        		echo 'Done'
        	}
        }
    }
}
    	