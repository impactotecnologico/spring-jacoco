pipeline {
	agent any
    stages {
    	stage('init') {
    		steps {
    			echo 'Hola mundo'
    		}
    	}
        stage('test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('build') {
            steps {
                bat 'mvn package -DskipTest'
            }
        }
        stage('finish') {
        	steps {
        		echo 'Done'
        	}
        }
    }
}
    	