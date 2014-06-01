modules = {
    application {
        resource url:'js/application.js'
    }
    bootstrap {
        dependsOn('jquery')
        resource url: [dir: 'css', file: 'bootstrap.min.css']
        resource url: [dir: 'css', file: 'bootstrap-theme.min.css']
        resource url: [dir: 'css', file: 'custom.css']
        resource url: [dir: 'js', file: 'bootstrap.min.js']
    }
}