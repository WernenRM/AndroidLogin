package Date

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "LOGIN")
class TaskLogin {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "EMAIL")
    var email: String? = null

    @ColumnInfo(name = ("SENHA"))
    var senha: Int? = null

}