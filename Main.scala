package Simple

object Main  extends App {

  // 1. get event
  // 2. store event in Cassandra
  val cassandraClient = new CassandraClient(connection = null)
  val event1: Event = ???
  cassandraClient.store(event1)
  // 3. close connection and exit application
  //
}
case class Event(customerId: Long, bullId: String, dueDate: Long)

class CassandraClient(connection: Any) {

  def store(event: Event): Unit = {
    // 1. connect to Cassandra
    // 2. store the event
    // 3. close connection
  }
}