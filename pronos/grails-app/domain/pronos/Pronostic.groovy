package pronos

class Pronostic {
      Integer b_domicile  // buts domicile
      Integer b_exterieur // buts exterieur
      Integer point = 0
      Game game
      User user
      Date time
      static belongsTo = [Game, User]
      static mapping = {
             id column: "id", generator: 'identity'
             version false
      }

      def beforeUpdate(){
        // Check time is before match
      }
}