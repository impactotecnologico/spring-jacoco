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
                bat 'mvnw package'
            }
        }
        stage('finish') {
        	steps {
        		echo 'Done'
        	}
        }
    }
}
    	