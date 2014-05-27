package pronos
import pronos.Game;


class GameService {

      def list (Map params = null){
      	       return Game.findAll()
	   }
      def get (id){
          return Game.get(id)
      }
}

