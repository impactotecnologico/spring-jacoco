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
                sh './mvnw package'
            }
        }
        stage('finish') {
        	steps {
        		echo 'Done'
        	}
        }
    }
}
    	