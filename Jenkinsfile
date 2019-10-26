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
                bat 'mvn package'
            }
        }
        stage('finish') {
        	steps {
        		echo 'Done'
        	}
        }
    }
}
    	