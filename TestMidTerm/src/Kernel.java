class Kernel {
    private String name;

    public Kernel() {
        this("Unknown Kernel ");
    }

    public Kernel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class BSD extends Kernel {
    public BSD() {
        super("BSD Kernel ");
    }
}

class Mach extends Kernel {
    public Mach() {
        super("Mach Kernel ");
    }
}

class XNU extends BSD, Mach {
}
