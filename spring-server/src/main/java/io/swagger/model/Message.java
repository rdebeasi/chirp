package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MessagesDonation;
import javax.validation.constraints.*;
/**
 * Message
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-11T19:51:44.331Z")

public class Message   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("donation")
  private MessagesDonation donation = null;

  public Message text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Message donation(MessagesDonation donation) {
    this.donation = donation;
    return this;
  }

   /**
   * Get donation
   * @return donation
  **/
  @ApiModelProperty(value = "")
  public MessagesDonation getDonation() {
    return donation;
  }

  public void setDonation(MessagesDonation donation) {
    this.donation = donation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.text, message.text) &&
        Objects.equals(this.donation, message.donation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, donation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    donation: ").append(toIndentedString(donation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

