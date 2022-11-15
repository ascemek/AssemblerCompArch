   // Program: Sum1ToN.asm
   // Computes: RAM[1] = 1 + 2 + 3 + ... + n
   // Usage: put a value >= 1 in RAM[0]
	// n = R0, the input
	@R0
	D=M
	@n
	M=D
	
	// i = 1
	@i
	M=1

	// sum = 0
        @sum
	M=0
	
     (LOOP)
	// if (i > n) goto STOP
	@i
	D=M
	@n
	D=D-M
	@STOP
	D;JGT
	
	// sum = sum + i
	@i
	D=M
	@sum
	M=D+M

	// i = i + 1
	@i
	M=M+1

	// goto LOOP
	@LOOP
	0;JMP

     (STOP)
        // RAM[1] = sum
        @sum
	D=M
	@R1
	M=D

     (END)
        @END
	0;JMP

