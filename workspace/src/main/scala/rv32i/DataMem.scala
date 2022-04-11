package rv32i
import chisel3._

class DataMem extends Module {
    val io = IO(new Bundle {
            val memWrite = Input(UInt(1.W))
            val memRead = Input(UInt(1.W))
            val memAddress = Input(UInt(10.W))
            val memData = Input(SInt(32.W))    
            val memOut = Output(SInt(32.W))  
    })

    val mem = Mem(1024, SInt(32.W))

}