package rv32i

import chisel3._
import chisel3.util.Cat

class AluControl extends Module {
    val io = IO(new Bundle {
        val aluOp = Input(UInt(3.W))
        val func7 = Input(UInt(1.W))
        val func3 = Input(UInt(3.W))
        val output = Output(UInt(5.W))        
    })

}