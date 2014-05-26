package pronos
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class ResultController {

    def index() { 
    render "page test"
    }
}
