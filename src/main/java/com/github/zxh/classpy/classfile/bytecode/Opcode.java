package com.github.zxh.classpy.classfile.bytecode;

import com.github.zxh.classpy.classfile.ClassParseException;

/**
 *
 * @author zxh
 */
public enum Opcode {
    
    // Constants
    nop             (0x00, 0),
    aconst_null     (0x01, 0),
    iconst_m1       (0x02, 0),
    iconst_0        (0x03, 0),
    iconst_1        (0x04, 0),
    iconst_2        (0x05, 0),
    iconst_3        (0x06, 0),
    iconst_4        (0x07, 0),
    iconst_5        (0x08, 0),
    lconst_0        (0x09, 0),
    lconst_1        (0x0a, 0),
    fconst_0        (0x0b, 0),
    fconst_1        (0x0c, 0),
    fconst_2        (0x0d, 0),
    dconst_0        (0x0e, 0),
    dconst_1        (0x0f, 0),
    bipush          (0x10, 1), // todo
    sipush          (0x11, 2), // todo
    ldc             (0x12, 1),
    ldc_w           (0x13, 2),
    ldc2_w          (0x14, 2),
    // Loads
    iload           (0x15, 1),
    lload           (0x16, 1),
    fload           (0x17, 1), // <-
    dload           (0x18, 1),
    aload           (0x19, 1),
    iload_0         (0x1a, 0),
    iload_1         (0x1b, 0),
    iload_2         (0x1c, 0),
    iload_3         (0x1d, 0),
    lload_0         (0x1e, 0),
    lload_1         (0x1f, 0),
    lload_2         (0x20, 0),
    lload_3         (0x21, 0),
    fload_0         (0x22, 0),
    fload_1         (0x23, 0),
    fload_2         (0x24, 0),
    fload_3         (0x25, 0),
    dload_0         (0x26, 0),
    dload_1         (0x27, 0),
    dload_2         (0x28, 0),
    dload_3         (0x29, 0),
    aload_0         (0x2a, 0),
    aload_1         (0x2b, 0),
    aload_2         (0x2c, 0),
    aload_3         (0x2d, 0),
    iaload          (0x2e, 0),
    laload          (0x2f, 0),
    faload          (0x30, 0),
    daload          (0x31, 0),
    aaload          (0x32, 0),
    baload          (0x33, 0),
    caload          (0x34, 0),
    saload          (0x35, 0),
    // Stores
    istore          (0x36, 1),
    lstore          (0x37, 1),
    fstore          (0x38, 1),
    dstore          (0x39, 1),
    astore          (0x3a, 1),
    istore_0        (0x3b, 0),
    istore_1        (0x3c, 0),
    istore_2        (0x3d, 0),
    istore_3        (0x3e, 0),
    lstore_0        (0x3f, 0),
    lstore_1        (0x40, 0),
    lstore_2        (0x41, 0),
    lstore_3        (0x42, 0),
    fstore_0        (0x43, 0),
    fstore_1        (0x44, 0),
    fstore_2        (0x45, 0),
    fstore_3        (0x46, 0),
    dstore_0        (0x47, 0),
    dstore_1        (0x48, 0),
    dstore_2        (0x49, 0),
    dstore_3        (0x4a, 0),
    astore_0        (0x4b, 0),
    astore_1        (0x4c, 0),
    astore_2        (0x4d, 0),
    astore_3        (0x4e, 0),
    iastore         (0x4f, 0),
    lastore         (0x50, 0),
    fastore         (0x51, 0),
    dastore         (0x52, 0),
    aastore         (0x53, 0),
    bastore         (0x54, 0),
    castore         (0x55, 0),
    sastore         (0x56, 0),
    // Stack
    pop             (0x57, 0),
    pop2            (0x58, 0),
    dup             (0x59, 0),
    dup_x1          (0x5a, 0),
    dup_x2          (0x5b, 0),
    dup2            (0x5c, 0),
    dup2_x1         (0x5d, 0),
    dup2_x2         (0x5e, 0),
    swap            (0x5f, 0),
    // Math
    iadd            (0x60, 0),
    ladd            (0x61, 0),
    fadd            (0x62, 0),
    dadd            (0x63, 0),
    isub            (0x64, 0),
    lsub            (0x65, 0),
    fsub            (0x66, 0),
    dsub            (0x67, 0),
    imul            (0x68, 0),
    lmul            (0x69, 0),
    fmul            (0x6a, 0), 
    dmul            (0x6b, 0),
    idiv            (0x6c, 0),
    ldiv            (0x6d, 0),
    fdiv            (0x6e, 0),
    ddiv            (0x6f, 0),
    irem            (0x70, 0),
    lrem            (0x71, 0),
    frem            (0x72, 0),
    drem            (0x73, 0),
    ineg            (0x74, 0),
    lneg            (0x75, 0),
    fneg            (0x76, 0),
    dneg            (0x77, 0),
    ishl            (0x78, 0),
    lshl            (0x79, 0),
    ishr            (0x7a, 0),
    lshr            (0x7b, 0),
    iushr           (0x7c, 0),
    lushr           (0x7d, 0),
    iand            (0x7e, 0),
    land            (0x7f, 0),
    ior             (0x80, 0),
    lor             (0x81, 0),
    ixor            (0x82, 0),
    lxor            (0x83, 0),
    iinc            (0x84, 2),
    // Conversions
    i2l             (0x85, 0),
    i2f             (0x86, 0),
    i2d             (0x87, 0),
    l2i             (0x88, 0),
    l2f             (0x89, 0),
    l2d             (0x8a, 0),
    f2i             (0x8b, 0),
    f2l             (0x8c, 0),
    f2d             (0x8d, 0),
    d2i             (0x8e, 0),
    d2l             (0x8f, 0),
    d2f             (0x90, 0),
    i2b             (0x91, 0),
    i2c             (0x92, 0),
    i2s             (0x93, 0),
    // Comparisons
    lcmp            (0x94, 0),
    fcmpl           (0x95, 0),
    fcmpg           (0x96, 0),
    dcmpl           (0x97, 0),
    dcmpg           (0x98, 0),
    ifeq            (0x99, 2),
    ifne            (0x9a, 2),
    iflt            (0x9b, 2),
    ifge            (0x9c, 2),
    ifgt            (0x9d, 2),
    ifle            (0x9e, 2),
    if_icmpeq       (0x9f, 2),
    if_icmpne       (0xa0, 2),
    if_icmplt       (0xa1, 2),
    if_icmpge       (0xa2, 2),
    if_icmpgt       (0xa3, 2),
    if_icmple       (0xa4, 2),
    if_acmpeq       (0xa5, 2),
    if_acmpne       (0xa6, 2),
    // Control
    _goto           (0xa7, 2),
    jsr             (0xa8, 2),
    ret             (0xa9, 1),
    tableswitch     (0xaa, 0),
    lookupswitch    (0xab, 0),// todo
    ireturn         (0xac, 0),
    lreturn         (0xad, 0),
    freturn         (0xae, 0),
    dreturn         (0xaf, 0),
    areturn         (0xb0, 0),
    _return         (0xb1, 0),
    // References
    getstatic       (0xb2, 2),
    putstatic       (0xb3, 2),
    getfield        (0xb4, 2),
    putfield        (0xb5, 2),
    invokevirtual   (0xb6, 2),
    invokespecial   (0xb7, 2),
    invokestatic    (0xb8, 2),
    invokeinterface (0xb9, 4),
    invokedynamic   (0xba, 4),
    _new            (0xbb, 2),
    newarray        (0xbc, 1),
    anewarray       (0xbd, 2),
    arraylength     (0xbe, 0),
    athrow          (0xbf, 0),
    checkcast       (0xc0, 2),
    _instanceof     (0xc1, 2),
    monitorenter    (0xc2, 0),
    monitorexit     (0xc3, 0),
    // Extended
    wide            (0xc4, 0), // todo
    multianewarray  (0xc5, 3),
    ifnull          (0xc6, 2),
    ifnonnull       (0xc7, 2),
    goto_w          (0xc8, 4),
    jsr_w           (0xc9, 4),
    // Reserved
    breakpoint      (0xca, 0),
    impdep1         (0xfe, 0),
    impdep2         (0xff, 0);
    
    
    public final int opcode;
    public final int operandCount;

    private Opcode(int opcode, int operandCount) {
        this.opcode = opcode;
        this.operandCount = operandCount;
    }
    
    
    public static Opcode valueOf(int opcode) {
        if (opcode < 0xca) {
            return values()[opcode];
        } else {
            throw new ClassParseException("Invalid opcode: " + opcode);
        }
    }
    
}
