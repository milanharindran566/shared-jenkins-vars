def call(Map config){
    node {
        echo "hi ${config.message}"
       sh '''
            git version

        ''' 
    }
}