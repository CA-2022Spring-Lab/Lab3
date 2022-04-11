package rv32i
import chisel3.iotesters.PeekPokeTester
import java.io.PrintWriter
// import chiseltest._

class TopTests(c: Top) extends PeekPokeTester(c) {
    // val reg_output = new PrintWriter("/workspace/regdump.txt")

    for(cycle <- 0 to 7){
        step(1)

        // reg_output.write(s"$cycle\n")
        // printf(s"reg_data: %s\n", peek(c.reg_file.io.rs1)) 
        // for(index <- 0 to 31){
        //     val reg_data = c.reg_file.registers(index).asSInt()
        //     // reg_output.write(s"$reg_data\n")
        //     printf(s"reg_data: %s\n", peek(reg_data)) 
        // }
    }

    // reg_output.close()
}