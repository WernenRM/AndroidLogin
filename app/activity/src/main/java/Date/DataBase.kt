package Date

import androidx.room.RoomDatabase
abstract class DataBase : RoomDatabase()  {

    abstract fun tasksDAO(): TasksDAO
}