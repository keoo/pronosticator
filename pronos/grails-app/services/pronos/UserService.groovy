package pronos


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
}