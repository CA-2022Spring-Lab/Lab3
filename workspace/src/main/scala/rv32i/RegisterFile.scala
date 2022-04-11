package rv32i
import chisel3._
import java.io.PrintWriter

class RegisterFile extends Module {
    val io = IO(new Bundle {
        val regWrite = Input(UInt(1.W))
        val rd_sel = Input(UInt(5.W))
        val rs1_sel = Input(UInt(5.W))
        val rs2_sel = Input(UInt(5.W))
        val writeData = Input(SInt(32.W))

        val rs1 = Output(SInt(32.W))
        val rs2 = Output(SInt(32.W))
    })

    val registers = RegInit(VecInit(Seq.fill(32)(0.S(32.W))))

    // For debug
    // val reg_output = new PrintWriter("/workspace/regdump.txt")
    // printf(s"%d\n", io.rs1)
    // printf(s"%d\n", io.rs2)
    // printf(s"\n")
}