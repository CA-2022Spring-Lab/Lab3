package rv32i
import chisel3._

class Control extends Module {
    val io = IO(new Bundle {
        val in_opcode = Input(UInt(7.W))
        val out_memWrite = Output(UInt(1.W))
        val out_branch = Output(UInt(1.W))
        val out_memRead = Output(UInt(1.W))
        val out_regWrite = Output(UInt(1.W))
        val out_memToReg = Output(UInt(1.W))
        val out_aluOp = Output(UInt(3.W))
        val out_operand_a_sel = Output(UInt(2.W))
        val out_operand_b_sel = Output(UInt(1.W))
        val out_extend_sel = Output(UInt(2.W))
        val out_next_pc_sel = Output(UInt(2.W))
    })

}