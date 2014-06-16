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
          def users = userService.getSortedUsers()
          users.sort { -it[1] }
          [users: users]
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

      def reset(params){
         [userid: params.id]
      }

      def reseted(params){
      	  userService.changeUserPassword(params.password, params.userid)
          redirect(action:"list")
      }

}
