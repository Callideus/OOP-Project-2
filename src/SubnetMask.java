/**
 * Created by raulmartinez on 4/4/16.
 */
public class SubnetMask extends IP {

    public SubnetMask() { }

    public SubnetMask(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException {
        super(quadOne, quadTwo, quadThree, quadFour);
    }

    public WildCardMask SubnetMaskToWildcardMask() throws IpException {
        return new WildCardMask(
                255-this.getQuadOne(),
                255-this.getQuadTwo(),
                255-this.getQuadThree(),
                255-this.getQuadFour());
    }

    @Override
    public String toString() {
        return String.format(
                "IP Subnet Mask: %d.%d.%d.%d",
                this.getQuadOne(),
                this.getQuadTwo(),
                this.getQuadThree(),
                this.getQuadFour());
    }
}