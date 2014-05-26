package game

class Pronostic {
      Integer b_domicile  // buts domicile
      Integer b_exterieur // buts exterieur
      Integer point = 0
      Match match
      User user
      Date time
      static belongsTo = [Match, User]
      static mapping = {
             id column: "id", generator: 'identity'
             version false
      }

      def beforeUpdate(){
        // Check time is before match
      }
}