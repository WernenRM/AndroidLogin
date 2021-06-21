package Date

import androidx.room.*

@Dao
interface TasksDAO {

    @Insert
    fun salva(usuario: TaskLogin?): Long?

    @Query("SELECT * FROM LOGIN")
    fun todos(): List<TaskLogin?>?

    @Delete
    fun remove(aluno: TaskLogin?)

    @Update
    fun edita(aluno: TaskLogin?)
}