package pronos
import pronos.Pronostic;


class PronosticService {
      def userService
      def gameService

       def list (Map params = null){
           return Pronostic.findAll()
	}

	def get (def id){
      	       return Pronostic.get(id)
	}

	def getByUser (Map params){
          	def user = userService.getCurrentUser()
                def query = Pronostic.where {
                   user == user
                }
      	        return query
	}

	def getByGivenUser (id){
          	def user = userService.get(id)
                def query = Pronostic.where {
                   user == user
                }
      	        return query
	}

	def create (Map params){
	  	def user = userService.getCurrentUser()
                def res = Pronostic.findByGameAndUser(gameService.get(params.game), user)
                if (!res) {
                     res = new Pronostic()
                     res.game = gameService.get(params.game)
                     res.user = user
                }

		res.b_domicile = params.b_domicile as int
		res.b_exterieur = params.b_exterieur as int
                Date d1 = new Date()
                res.time = d1

                res.save(flush:true)
	}


	def setPoints(prono, game){
	    if (prono.b_domicile == game.bdomicile && prono.b_exterieur == game.bexterieur) {
	       prono.point = 5;
	       prono.save(flush:true)
	    } else if (prono.b_domicile - prono.b_exterieur == game.bdomicile - game.bexterieur) {
	       prono.point = 4;
	       prono.save(flush:true)
	    } else if (prono.b_domicile > prono.b_exterieur && game.bdomicile > game.bexterieur){
	       prono.point = 3;
	       prono.save(flush:true)
	    } else if (prono.b_exterieur > prono.b_domicile && game.bexterieur > game.bdomicile){
	       prono.point = 3;
	       prono.save(flush:true)
	    } else {
	       prono.point = 1;
	       prono.save(flush:true)	    
	    }

	}


	def update(Map params){
	    def game = gameService.get(params.game)	    
	    def list = Pronostic.where {
                   game == game
	    }
	    for (prono in list){
	    	setPoints(prono, game)
		}
	}

	def getSortedUsers() {
	      def c = Pronostic.createCriteria()
	      def res = c.list {
	      	  projections {
		  	      groupProperty 'user'
		  	      sum 'point'
		  }
	      }
            return res

	    
	}

}

