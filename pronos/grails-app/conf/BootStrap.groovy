import pronos.User
import pronos.Game
import pronos.UserRole
import pronos.Role

class BootStrap {

    def init = { servletContext ->
    	createDefaultUser()
        createGames()
    }
    def destroy = {
    }

    private void createDefaultUser(){
          def roleUser = Role.findByAuthority('ROLE_USER')
	  if( !roleUser )
		roleUser = new Role(authority: 'ROLE_USER',description:'User role').save(flush:true)

          def user = User.findByUsername('user')
          if ( ! user ){
      	  user = new User(
	       username : 'user',
	       password : 'user',
	       firstname : 'user',
	       lastname : 'user',
	       activated : 1
	       ).save(flush:true)

	       UserRole.create user, roleUser, true
          }

//      def admin = User.findByUsername('admin')
//      if ( ! admin ){
//      	 admin = new User(
//	       username : 'admin',
//	       password : 'admin',
//	       firstname : 'admin',
//	       lastname : 'admin',
//	       activated : 1
//	       ).save(flush:true)
//      }
    }

    private void createGames(){
            Date d1 = new Date()
            def game1 = new Game(domicile: 'france', exterieur: 'uruguay', starttime: d1).save(flush:true)            
            def game2 = new Game(domicile: 'brasil', exterieur: 'china', starttime: d1).save(flush:true)            
            def game3 = new Game(domicile: 'ukrania', exterieur: 'russia', bdomicile: 2, bexterieur: 1, starttime: d1).save(flush:true)            
    }
}
