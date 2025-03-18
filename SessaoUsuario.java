package padroescriacao.singleton;

public class SessaoUsuario {
    private static SessaoUsuario instance = new SessaoUsuario();
    private String usuarioLogado;

    private SessaoUsuario() {}

    public static SessaoUsuario getInstance() {
        return instance;
    }

    public String getUsuarioLogado() {
        return this.usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
