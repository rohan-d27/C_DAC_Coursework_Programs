	.file	"age.c"
	.def	___main;	.scl	2;	.type	32;	.endef
	.section .rdata,"dr"
LC0:
	.ascii "Enter your age\0"
LC1:
	.ascii "%d\0"
LC2:
	.ascii "child\0"
LC3:
	.ascii "adult\0"
LC4:
	.ascii "senior citizen\0"
	.text
	.globl	_main
	.def	_main;	.scl	2;	.type	32;	.endef
_main:
LFB6:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	andl	$-16, %esp
	subl	$32, %esp
	call	___main
	movl	$LC0, (%esp)
	call	_printf
	leal	28(%esp), %eax
	movl	%eax, 4(%esp)
	movl	$LC1, (%esp)
	call	_scanf
	movl	28(%esp), %eax
	cmpl	$17, %eax
	jg	L2
	movl	$LC2, (%esp)
	call	_printf
	jmp	L3
L2:
	movl	28(%esp), %eax
	cmpl	$18, %eax
	jle	L4
	movl	28(%esp), %eax
	cmpl	$65, %eax
	jg	L4
	movl	$LC3, (%esp)
	call	_printf
	jmp	L3
L4:
	movl	28(%esp), %eax
	cmpl	$65, %eax
	jle	L3
	movl	$LC4, (%esp)
	call	_printf
L3:
	movl	$0, %eax
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
LFE6:
	.ident	"GCC: (GNU) 4.8.1"
	.def	_printf;	.scl	2;	.type	32;	.endef
	.def	_scanf;	.scl	2;	.type	32;	.endef
