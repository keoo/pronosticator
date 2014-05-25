package game

class Match {
      String domicile
      String exterieur
      Integer b_domicile  = -1 // buts domicile
      Integer b_exterieur = -1 // buts exterieur
      Date match

      static hasMany = [
             pronos: Pronostic
      ]

      static mapping = {
             id column: 'id', generator: 'identity'
             version false
      }

      def afterUpdate(){
          // Calculate all points on associated pronostics
      }
}