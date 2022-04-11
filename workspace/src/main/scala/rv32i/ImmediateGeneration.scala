package rv32i
import chisel3._
import chisel3.util.Cat
import chisel3.util.Fill

class ImmediateGeneration extends Module {
    val io = IO(new Bundle {
        val instruction = Input(UInt(32.W))
        val pc = Input(SInt(32.W))
        val s_imm = Output(SInt(32.W))
        val sb_imm = Output(SInt(32.W))
        val u_imm = Output(SInt(32.W))
        val uj_imm = Output(SInt(32.W))
        val i_imm = Output(SInt(32.W))
    })
    // ----- Calculating S-Immediate ------ //

    // ----- Calculating SB-Immediate ------ //

    // ----- Calculating U-Immediate ------ //

    // ----- Calculating UJ-Immediate ----- //

    // ----- Calculating I-Immediate ----- //

}