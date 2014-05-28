import pronos.User
import pronos.Game
import pronos.UserRole
import pronos.Role
import java.text.SimpleDateFormat

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

      	  user = new User(
	       username : 'jean',
	       password : 'jean',
	       firstname : 'jean',
	       lastname : 'durand',
	       activated : 1
	       ).save(flush:true)

	       UserRole.create user, roleUser, true

      	  user = new User(
	       username : 'bob',
	       password : 'bob',
	       firstname : 'bob',
	       lastname : 'sponge',
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
//            Date d1 = new Date()
//            def game1 = new Game(domicile: 'france', exterieur: 'uruguay', starttime: d1).save(flush:true)            
//            def game2 = new Game(domicile: 'brasil', exterieur: 'china', starttime: d1).save(flush:true)            
//            def game3 = new Game(domicile: 'ukrania', exterieur: 'russia', bdomicile: 2, bexterieur: 1, starttime: d1).save(flush:true)
              Date d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-12")
	      def game1 = new Game(domicile: 'Brésil', exterieur: 'Croatie', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-13")
	      game1 = new Game(domicile: 'Mexique', exterieur: 'Cameroun', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-13")
	      game1 = new Game(domicile: 'Espagne', exterieur: 'Pays-Bas', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-14")
	      game1 = new Game(domicile: 'Chili', exterieur: 'Australie', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-14")
	      game1 = new Game(domicile: 'Colombie', exterieur: 'Grèce', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-14")
	      game1 = new Game(domicile: 'Uruguay', exterieur: 'Costa-Rica', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-15")
	      game1 = new Game(domicile: 'Cote d\'Ivoire', exterieur: 'Japon', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-15")
	      game1 = new Game(domicile: 'Angleterre', exterieur: 'Italie', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-15")
	      game1 = new Game(domicile: 'Suisse', exterieur: 'Equateur', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-15")
	      game1 = new Game(domicile: 'France', exterieur: 'Honduras', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-16")
	      game1 = new Game(domicile: 'Argentine', exterieur: 'Bosnie', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-16")
	      game1 = new Game(domicile: 'Allemagne', exterieur: 'Portugal', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-16")
	      game1 = new Game(domicile: 'Iran', exterieur: 'Nigéria', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-17")
	      game1 = new Game(domicile: 'Ghana', exterieur: 'USA', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-17")
	      game1 = new Game(domicile: 'Belgique', exterieur: 'Algérie', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-17")
	      game1 = new Game(domicile: 'Brésil', exterieur: 'Mexique', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-18")
	      game1 = new Game(domicile: 'Russie', exterieur: 'Corée du sud', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-18")
	      game1 = new Game(domicile: 'Australie', exterieur: 'Pays-Bas', starttime: d1).save(flush:true)
              d1 = new SimpleDateFormat("yyyy-MMM-dd").parse("2014-JUN-18")
	      game1 = new Game(domicile: 'Espagne', exterieur: 'Chili', starttime: d1).save(flush:true)
    }
}
