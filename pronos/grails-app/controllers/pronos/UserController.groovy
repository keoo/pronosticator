package pronos
import pronos.User;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER', 'ROLE_ADMIN'])
class UserController {
      def userService

      def index(){
           redirect(action:"list",params:params)
      }

      def list() {
          def list = userService.getSortedUsers()
          [list:list]
      }

      def logout(){
      	  redirect(controller: "logout")
      }

      def password(){

      }
      def passwordified(params){
      	  userService.changePassword(params.password)
          redirect(action:"list")
      }
}