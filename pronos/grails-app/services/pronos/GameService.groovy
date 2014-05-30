package pronos
import pronos.Game;


class GameService {

      def list (Map params = null){
      	       return Game.findAll()
	   }
      def get (id){
          return Game.get(id)
      }

      def update(Map params){
      	  def g = Game.get(params.game)
	  g.bdomicile = params.b_domicile as int
	  g.bexterieur = params.b_exterieur as int
	  g.save(flush:true)
      }

      def create(Map params) {
             def game = new Game(domicile: params.domicile, exterieur: params.exterieur, starttime: params.starttime)
	     game.save(flush:true)

      }
}

