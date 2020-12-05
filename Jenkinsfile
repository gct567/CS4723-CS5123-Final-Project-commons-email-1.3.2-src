pipeline {
  
    agent any
    
    tools{
      maven "3.6.0"
    }
  
    stages {
      stage("Start Stage") {
        
        steps {
            echo 'Rolando Chapa gct***'
            echo 'Here is My Second Project'
        }
      }    	
      
      stage("BuildStage") {
        
        steps {
            echo 'building the app using maven...'
            sh "mvn -version"
            sh "mvn -B -DskipTests clean package"
        }
      }
      
      stage("TestStage") {
        
        steps {
            echo 'gct*** testing the app using maven...'
            echo 'here we are gonna test the template test, and two other tests from project 1'

            sh "mvn test"
        }
      }
      
      stage("DeliverStage") {
        
        steps {
            echo 'deploying the app...'
            sh './jenkins/deploy.sh'
        }
      }
    }
}
