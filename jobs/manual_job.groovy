node()
{
    stage('Checkout repository') {
      git url: 'https://github.com/danpaldev/phase01_task03'
    }
    stage('count number of sudo commands') {
        sh 'grep sudo setup_wordpress.sh|wc -l'
    }
}
