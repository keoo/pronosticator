package pronos
import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class RegistrationController {

def springSecurityService
def userService

def register(){

    def userInstance = new User(params)
    [userInstance: userInstance]
}

def create(){
    render "params: "+params
    def user = userService.create(params)
    redirect(controller:'login',action:'auth')
}



}