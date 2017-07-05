package scheduling_app

class Event {

    String title
    Date startingDate
    Date endingDate

    static belongsTo = [user: User]

    static mapping = {
        id name: 'eventID'
        id generator: 'increment'
    }

    static constraints = {
        user nullable: false
        title(blank: false)
        user nullable: false
        startingDate nullable: false
        endingDate nullable: false

    }
}
