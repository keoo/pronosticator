package pronos

import pronos.User
import pronos.UserRole


class UserService {
    /* Inject dependencies */
    def springSecurityService
    def grailsApplication

    boolean isLoggedIn() {
        springSecurityService.isLoggedIn()
    }

    def getCurrentUser() {
        springSecurityService.getCurrentUser()
    }

    def list () {
        User.list()
    }

    def get(def id) {
        User.get(id)
    }
    def getSortedUsers (){
            def query = User.list(sort:"point", order:"desc")
            return query

    }

    def create(Map params){
          def roleUser = Role.findByAuthority('ROLE_USER')
          def user = User.findByUsername(params.user)
          if ( ! user ){
      	  user = new User(
	       username : params.user,
	       password : params.pwd,
	       firstname : params.prenom,
	       lastname : params.nom,
	       activated : 1
	       ).save(flush:true)

	       UserRole.create user, roleUser, true
	       }
    }
}