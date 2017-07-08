package scheduling_app

class User {

    String userName
    String firstName
    String lastName
    String email
    String imageUrl

    static hasOne = [authToken: AuthToken]
    static hasMany = [events: Event]

    static mapping = {
        table "users"
        version false
    }

    static constraints = {
        userName unique: true
        firstName nullable: true
        lastName nullable: true
        email unique: true
        authToken nullable: true
        imageUrl nullable: true, blank: false
    }
}
